# Opinionated example project

## Backend choices

| Lib | Confidence level | Comments |
|---|---|---|
| Integrant | Very high | |
| Reitit | Very high | |
| Malli | Very high | |
| Next.jdbc | Very high | |
| Honeysql | High | Can be useful to generate dynamic SQL queries |
| HugSQL | High | Can be useful when writing SQL by hand |
| hikari-cp | High | TODO: Check how necessary connection pool is with next.jdbc |

## Frontend choices

| Lib | Confidence level | Comments |
|---|---|---|
| UIx | High | Simple React wrapper makes it easier to use modern React and libs |
| Re-frame | Medium | Even though Re-frame is for Reagent, it is usable with UIx and we have considerable experience using it |
| MUI | Medium? | One solution to writing styles inline in the Cljs components, seems to work relatively well with Cljs |
| Reitit-frontend | Medium? | Good enough? It is used in most projects already. |
| Malli | High | If/when needed for FE route parameter validation or any other schema validations. |
| MAYBE: TanStack Query | Low? Medium? | Useful abstraction for making calls to backend. Some challenges on using this together with Re-frame (and some with Cljs, but mostly solved.) |

Open questions?
- Forms
