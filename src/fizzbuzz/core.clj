(ns fizzbuzz.core)

(defn divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn fizzbuzz [arg]
  (cond
    (= arg 0) "0"
    (= arg 5) "buzz"
    (divisible-by? 3 arg) "fizz"
    :else (str arg)))


(defn -main
  [& args]
  (println "Hello World"))
