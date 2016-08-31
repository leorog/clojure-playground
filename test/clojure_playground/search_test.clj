(ns clojure-playground.search-test
  (:require [clojure.test :refer :all]
            [clojure-playground.search :refer :all]))

(deftest recursive-time
  (testing "recursive sequential search exec time"
    (println "running recursive search")
    (is
     (= (time (recursive-contains-val? (range 10000) 10000)) nil))))

(deftest reduced-time
  (testing "reduced sequential search exec time"
    (println "running reduced search")
    (is
     (= (time (recursive-contains-val? (range 10000) 10000)) nil))))

