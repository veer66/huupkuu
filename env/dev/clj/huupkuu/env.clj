(ns huupkuu.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [huupkuu.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[huupkuu started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[huupkuu has shut down successfully]=-"))
   :middleware wrap-dev})
