package february

fun findBottomLeftValue(root: TreeNode?): Int {

    if (root == null) return 0

    val queue = ArrayDeque<TreeNode>()
    var result = root.`val`

    queue.add(root)

    while (queue.isNotEmpty()){
        result = queue.first().`val`

        repeat(queue.size){
            val node = queue.removeFirst()
            node.left?.let { queue.add(it) }
            node.right?.let { queue.add(it) }
        }
    }

    return result
}