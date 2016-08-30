(ns clojure-playground.search)

(defn contains-nil-val?
  "check if a map has a nil value"
  [coll]
  (->> coll
       (vals)
       (set)
       (contains? nil)))

(defn recursive-contains-val?
  "recursive sequential search"
  [coll val]
  (when (seq coll)
    (or (= val (first coll))
        (recur (next coll) val))))

(defn reduced-contains-val?
  "reduced sequential search"
  [coll val]
  (reduce #(if (= val %2) (reduced true) %1) false coll))
