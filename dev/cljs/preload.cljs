(ns preload
  (:require [re-frame.core :as rf]
            [shadow.cljs.devtools.client.browser]
            [uix.dev]))

(uix.dev/init-fast-refresh!)

(defn ^:dev/after-load refresh []
  (rf/clear-subscription-cache!)
  (uix.dev/refresh!))

(defonce init-repl!
  (let [eval-fn shadow.cljs.devtools.client.browser/global-eval]
    (set! shadow.cljs.devtools.client.browser/global-eval
          (fn [s]
            (let [_ (set! (.-eval-in-repl? js/globalThis) true)
                  ret (eval-fn s)
                  _ (set! (.-eval-in-repl? js/globalThis) false)]
              ret)))))
