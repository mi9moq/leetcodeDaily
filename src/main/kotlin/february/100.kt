package february

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    return when {
        p == null || q == null -> p == q
        p.`val` != q.`val` -> false
        else -> isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }
}