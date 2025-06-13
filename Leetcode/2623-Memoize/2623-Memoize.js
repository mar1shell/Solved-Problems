/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
  let memo = new Map();

  return function (...args) {
    key = args.join(",");

    if (memo.has(key)) {
      return memo.get(key);
    } else {
      let current = fn(...args);
      memo.set(key, current);
      return current;
    }
  };
}
