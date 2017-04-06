(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn good-enough?
  [current-guess previous-guess]
  (< (abs (- current-guess previous-guess)) 0.001))

(defn square
  [x]
  (* x x))

(defn improve
  [guess x]
  (/ (+ (/ x (square guess))
        (* 2 guess))
     3))

(defn cube-root-iter
  [guess previous-guess x]
  (if (good-enough? guess previous-guess)
    guess
    (cube-root-iter (improve guess x)
                    guess
                    x)))

(defn cube-root
  [x]
  (cube-root-iter 1.0 0 x))

(cube-root 27)

;; cube-root of 27 returns 3.0000000000000977
;; cube-root of 81 returns 4.326748733642904
;; cube-root of 1000 returns 10.000000000000002
