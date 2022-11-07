# A process tree of a hypothetical chain of processes is represented in a tree structure.
# Every process spawns a number of processes equal to that of its process number i.e. process number 3 has 3 children.
# The processes are named in level order, root being 1, its child/children are named from 2 and so on.
# What is the process number of the parent process of a given process?
#       1
#        \
#         2
#        /  \
#       3    4
#       |     |
#   +-+-+     +-+--+-+
#   | | |     | |  | |
#   5 6 7     8 9 10 11
# So for 6, the parent process would be 3.

def process_tree_parent(target: int) -> int:
    root = 1
    first_child = root + 1
    last_child = first_child + root - 1
    while root <= target:
        root += 1
        first_child = last_child + 1
        last_child = first_child + root - 1
        if first_child <= target <= last_child:
            return root
    return -1


if __name__ == '__main__':
    print(process_tree_parent(9))
