;; applicative-order evaluation = evaluate the arguments then apply.
;; normal-order evaluation = fully expand then reduce.

(defn p
  []
  (p)) ;; recursive call

(defn test
  [x y]
  (if (= x 0)
    0
    y))

(test 0 (p))

;; With applicative-order the call to p will be evaluated causing a java.lang.StackOverflowError.
;; If it where normal-order the call to test would be first evaluated causing the if to resolve to true and return 0. This means the call to p never happens.
