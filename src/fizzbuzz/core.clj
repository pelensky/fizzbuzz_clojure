(ns fizzbuzz.core)

(defn fizzbuzz [arg]
  (if (= arg 3) "fizz" (str arg) ))

(defn -main
  [& args]
  (println "Hello World"))
