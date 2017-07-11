(ns fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [fizzbuzz.core :refer :all]))

(describe "Fizzbuzz Game"
  (it "returns 0 when 0"
    (should= "0"
      (fizzbuzz 0))))
