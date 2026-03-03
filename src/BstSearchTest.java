import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    public void testBSTRootOnly() {
        BinaryTreeNode<Integer> bstTree = new BinaryTreeNode<>(23, null, null);
        assertTrue(BstSearch.contains(bstTree, 23));
    }
    @Test
    public void testBSTValidTree() {
        BinaryTreeNode<Integer> bstTree = new BinaryTreeNode<>(23, null, null);
        bstTree.left = new BinaryTreeNode<Integer>(12, new BinaryTreeNode<>(11), new BinaryTreeNode<>(13));
        bstTree.right = new BinaryTreeNode<Integer>(25, new BinaryTreeNode<>(24), new BinaryTreeNode<>(26));
        assertTrue(BstSearch.contains(bstTree, 26));
    }
}
