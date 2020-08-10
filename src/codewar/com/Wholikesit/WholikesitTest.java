package codewar.com.Wholikesit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WholikesitTest {

    @Test
    public void staticTests() {
        assertEquals("no one likes this", Wholikesit.whoLikesIt());
        assertEquals("Peter likes this", Wholikesit.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Wholikesit.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Wholikesit.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Wholikesit.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
