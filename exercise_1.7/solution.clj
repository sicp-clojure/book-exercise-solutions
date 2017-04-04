(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn good-enough?
  [current-guess previous-guess]
  (< (abs (- current-guess previous-guess)) 0.001))

(defn average
  [x y]
  (/ (+ x y) 2))

(defn improve
  [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter
  [guess previous-guess x]
  (if (good-enough? guess previous-guess)
    guess
    (sqrt-iter (improve guess x)
               guess
               x)))

(defn sqrt
  [x]
  (sqrt-iter 1.0 0 x))

(sqrt 9)

;; sqrt of 9 returns 3.000000001396984
;; sqrt of 100000000 returns 10000.0
