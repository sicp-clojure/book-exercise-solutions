;; Function that takes 3 numbers and returns the sum of the squares of the two larger numbers.
(defn square
  [x]
  (* x x))

(defn sum-of-squares
  [x y]
  (+ (square x) (square y)))

(defn max
  [x y]
  (if (> x y) x y))

(defn min
  [x y]
  (if (< x y) x y))

(defn sum-largest-two-squares
  [x y z]
  (sum-of-squares (max x y)
                  (max (min x y) z)))

(sum-largest-two-squares 10 2 13)

;; answer = 269

