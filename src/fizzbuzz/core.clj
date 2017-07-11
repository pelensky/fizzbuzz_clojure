(ns fizzbuzz.core)

(defn fizzbuzz [arg]
  (cond
    (= arg 5) "buzz"
    (= arg 3) "fizz"
    :else (str arg)))

(defn -main
  [& args]
  (println "Hello World"))
