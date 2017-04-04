(defn new-if
  [predicate then-clause else-clause]
  (cond predicate
        then-clause
        :else else-clause))

;; (new-if (= 2 3) 0 5) ;; Value: 5
;; (new-if (= 1 1) 0 5) ;; Value: 0

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn square
  [x]
  (* x x))

(defn good-enough?
  [guess x]
  (< (abs (- (square guess) x)) 0.001))

(defn average
  [x y]
  (/ (+ x y) 2))

(defn improve
  [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter
  [guess x]
  (new-if (good-enough? guess x)
          guess
          (sqrt-iter (improve guess x)
                     x)))

(defn sqrt
  [x]
  (sqrt-iter 1.0 x))

(sqrt 9)

;; if = 3.00009155413138
;; new-if = java.lang.StackOverflowError. This is caused by the new-if function using applicative-order, which means that the call to sqrt-iter is always evaluated.
