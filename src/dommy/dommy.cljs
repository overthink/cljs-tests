(ns cljs-tests.dommy
  (:require [dommy.core :as dommy])
  (:require-macros [dommy.macros :refer [sel sel1]]))

(dommy/set-text! (sel1 :#location) "hello dommy")

