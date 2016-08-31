(ns clojure-playground.fibonacci-test
  (:require [clojure.test :refer :all]
            [clojure-playground.fibonacci :refer :all]))

(deftest fib-test
  (testing "test fibonacci results"
    (is (= (fib 6) 8))
    (is (= (fib 10) 55))
    (is (= (fib 50) 12586269025))
    (is (= (fib 200) 280571172992510140037611932413038677189525))))

(deftest lazy-seq-fib-test
  (testing "test fibonacci results"
    (is (= (lazy-seq-fib 6) 8))
    (is (= (lazy-seq-fib 10) 55))
    (is (= (lazy-seq-fib 50) 12586269025))
    (is (= (lazy-seq-fib 200) 280571172992510140037611932413038677189525))))

(deftest fib-seq-test
  (testing "test fibonacci sequence"
    (is (= (take 10 (fib-seq)) '(1N 1N 2N 3N 5N 8N 13N 21N 34N 55N)))))
