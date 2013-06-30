(ns cljs-tests.first)

(defn log [msg]
  (.log js/console (str "LOG: " msg)))

(log "starting")
(def div (.getElementById js/document "location"))
(set! (.-innerHTML div) "hello world")
(log "done")

