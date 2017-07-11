(ns fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [fizzbuzz.core :refer :all]))

(describe "Fizzbuzz Game"
  (it "returns 0 when 0"
    (should= "0"
      (fizzbuzz 0)))

  (it "returns 1 when 1"
    (should= "1"
      (fizzbuzz 1)))

  (it "returns 2 when 2"
    (should= "2"
      (fizzbuzz 2)))

  (it "returns fizz when 3"
    (should= "fizz"
      (fizzbuzz 3)))

  (it "returns 4 when 4"
    (should= "4"
      (fizzbuzz 4)))

  (it "returns 5 when 5"
    (should= "buzz"
      (fizzbuzz 5))))
