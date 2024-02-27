package february

fun diameterOfBinaryTree(root: TreeNode?): Int {

    var diameter = 0

    fun longestPath(node: TreeNode?): Int {

        if (node == null) return 0

        val left = longestPath(node.left)
        val right = longestPath(node.right)

        diameter = maxOf(diameter, left + right)

        return maxOf(left, right) + 1
    }

    longestPath(root)

    return diameter
}