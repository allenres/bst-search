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

    @Test
    public void testBSTNullRoot() {
        BinaryTreeNode<Integer> bstTree = null;
        assertFalse(BstSearch.contains(bstTree, 23));
    }

    @Test
    public void testBSTNullTarget() {
        BinaryTreeNode<Integer> bstTree =
            new BinaryTreeNode<>(23, null, null);

        assertThrows(NullPointerException.class,
            () -> BstSearch.contains(bstTree, null));
    }

    @Test
    public void testBSTValueNotFound() {
        BinaryTreeNode<Integer> bstTree = new BinaryTreeNode<>(23, null, null);
        bstTree.left = new BinaryTreeNode<>(12, new BinaryTreeNode<>(11), new BinaryTreeNode<>(13));
        bstTree.right = new BinaryTreeNode<>(25, new BinaryTreeNode<>(24), new BinaryTreeNode<>(26));

        assertFalse(BstSearch.contains(bstTree, 99));
    }
}
