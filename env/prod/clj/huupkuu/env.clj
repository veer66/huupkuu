(ns huupkuu.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[huupkuu started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[huupkuu has shut down successfully]=-"))
   :middleware identity})
