# Java Usages
## Useful Code Blocks

# Common Sense
- Integer.MAX_VALUE=2^31-1
- Integer.MAX_VALUE=-2^31

# Common Classes
## Priority Queue
Natural order 1,2,3,4
Collections.reverseOrder()
- .PriorityQueue<>(initial, Ordering)
- .add()
- .contains()
- .clear()
- .offer()
- .remove()
- .peek()
- .poll()

## Set HashSet
- .toArray() T[]
- .add()
- .addAll()
- .remove()
- .removeAll()
- .isEmpty()
- .contains()
- .containsAll()
- .size()
- .clear()
- .clone()

## Map HashMap
- .containsKey()
- .containsValue()
- .get()
- .getOrDefault(value, default)
- .isEmpty()
- .keySet()
- .entrySet()
- .put()
- .putAll()
- .remove(key)
- .remove(key, value) specified key and value
- .size()
- .values()

## Character
- .isDigit()

## Integer
- .valueOf()

## LinkedList
- .add(E)
- .add(idx, E)
- .addFirst(E)
- .addLast(E)
- .get(idx)
- .getFirst()
- .getLast()
- .offerFirst()
- .offerLast()
- .offer()

## String
- .toLowerCase()
- .substring(i, j)
- .substring(i) begins at ith.
- .concat(str)
- .contains()
- .endsWith()
- .equals()
- .charAt()
- .length()
- .replace(char, char)
- .split(regex)
- .toCharArray()


## StringBuilder
- .append()
- .deleteCharAt() ***
- .delete(i, j)
- .toString()
- .insert(i, char)
- .setCharAt(idx, ch)

## List
- .add(idx, E)
- .add(E)
- .size()
- .remove()
- .sort((i1, i2) -> Integer.compare(i1.start, i2.start))

## Deque
- .offerLast()
- .offerFirst()
- .pollLast()
- .pollFirst()
- .isEmpty()
- .peekFirst()
- .peekLast()
