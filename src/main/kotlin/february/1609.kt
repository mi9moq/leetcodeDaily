package february

fun isEvenOddTree(root: TreeNode?): Boolean {
    if (root == null) return true

    val queue = ArrayDeque<TreeNode>()
    queue.add(root)
    var level = 1

    while (queue.isNotEmpty()) {

        var prev = queue.first().`val`

        repeat(queue.size) {
            if (it == 0) {
                if (level % 2 == 0 && prev % 2 != 0) return false
                if (level % 2 == 1 && prev % 2 != 1) return false
                val node = queue.removeFirst()
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            } else {
                val node = queue.removeFirst()
                val current = node.`val`
                if (level % 2 == 0 && (current % 2 != 0 || current >= prev)) return false
                if (level % 2 == 1 && (current % 2 != 1 || current <= prev)) return false
                prev = current
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
        }

        level++
    }

    return true
}