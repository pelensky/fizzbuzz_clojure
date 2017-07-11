(ns fizzbuzz.core)

(defn divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn fizzbuzz [arg]
  (cond
    (= arg 0) "0"
    (divisible-by? 5 arg) "buzz"
    (divisible-by? 3 arg) "fizz"
    :else (str arg)))


(defn -main
  [& args]
  (println "Hello World"))
