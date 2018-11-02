(ns user
  (:require [huupkuu.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [huupkuu.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'huupkuu.core/repl-server))

(defn stop []
  (mount/stop-except #'huupkuu.core/repl-server))

(defn restart []
  (stop)
  (start))


