(ns clojure-playground.fibonacci)

(defn fib
  [num]
  (loop [a (bigint 0) b (bigint 1) x num]
    (if (= x 0)
      a
      (recur (+ a b) a (dec x)))))

(defn fib-seq
  ([] (fib-seq (bigint 0) (bigint 1)))
  ([a b] (lazy-seq (cons b (fib-seq b (+ a b))))))

(defn lazy-seq-fib
  [num]
  (last (take num (fib-seq))))
