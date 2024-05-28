/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null){
            return list2;
        }
        return list1;
    }
}

//Detailed Example with list1 = [1, 2, 4] and list2 = [1, 3, 4]
// Step-by-Step Explanation
// Base Cases
// Case 1: Either list1 or list2 is null
// java
// Copy code
// if (list1 == null) {
//     return list2;
// }
// if (list2 == null) {
//     return list1;
// }
// If either list1 or list2 is null, we return the non-null list. If both are null, the result is null, which means both lists are empty.
// Recursive Case
// Case 2: Both list1 and list2 are not null

// java
// Copy code
// if (list1 != null && list2 != null) {
//     if (list1.val < list2.val) {
//         list1.next = mergeTwoLists(list1.next, list2);
//         return list1;
//     } else {
//         list2.next = mergeTwoLists(list1, list2.next);
//         return list2;
//     }
// }
// When both list1 and list2 have nodes, we compare the values of the current nodes (list1.val and list2.val).

// If list1.val < list2.val, the next node of list1 should be the result of merging the rest of list1 (list1.next) with all of list2.
// java
// Copy code
// list1.next = mergeTwoLists(list1.next, list2);
// return list1;
// If list1.val >= list2.val, the next node of list2 should be the result of merging all of list1 with the rest of list2 (list2.next).
// java
// Copy code
// list2.next = mergeTwoLists(list1, list2.next);
// return list2;
// Let's go through the function calls step-by-step.

// First Call: mergeTwoLists([1, 2, 4], [1, 3, 4])

// Compare list1.val (1) and list2.val (1).
// Since 1 >= 1, list2.next will be the result of mergeTwoLists([1, 2, 4], [3, 4]).
// Second Call: mergeTwoLists([1, 2, 4], [3, 4])

// Compare list1.val (1) and list2.val (3).
// Since 1 < 3, list1.next will be the result of mergeTwoLists([2, 4], [3, 4]).
// Third Call: mergeTwoLists([2, 4], [3, 4])

// Compare list1.val (2) and list2.val (3).
// Since 2 < 3, list1.next will be the result of mergeTwoLists([4], [3, 4]).
// Fourth Call: mergeTwoLists([4], [3, 4])

// Compare list1.val (4) and list2.val (3).
// Since 4 >= 3, list2.next will be the result of mergeTwoLists([4], [4]).
// Fifth Call: mergeTwoLists([4], [4])

// Compare list1.val (4) and list2.val (4).
// Since 4 >= 4, list2.next will be the result of mergeTwoLists([4], []).
// Sixth Call: mergeTwoLists([4], [])

// Since list2 is null, return list1 which is [4].
// Returning the Results
// Fifth Call: Returns list2 which is [4] -> [4].
// Fourth Call: Returns list2 which is [3] -> [4] -> [4].
// Third Call: Returns list1 which is [2] -> [3] -> [4] -> [4].
// Second Call: Returns list1 which is [1] -> [2] -> [3] -> [4] -> [4].
// First Call: Returns list2 which is [1] -> [1] -> [2] -> [3] -> [4] -> [4].
// Visualizing the Recursive Calls as a Tree
// css
// Copy code
// mergeTwoLists([1, 2, 4], [1, 3, 4])
//     ├── mergeTwoLists([1, 2, 4], [3, 4])
//     │   ├── mergeTwoLists([2, 4], [3, 4])
//     │   │   ├── mergeTwoLists([4], [3, 4])
//     │   │   │   ├── mergeTwoLists([4], [4])
//     │   │   │   │   ├── mergeTwoLists([4], [])
//     │   │   │   │   │   └── [4]
//     │   │   │   │   └── [4, 4]
//     │   │   │   └── [3, 4, 4]
//     │   │   └── [2, 3, 4, 4]
//     │   └── [1, 2, 3, 4, 4]
//     └── [1, 1, 2, 3, 4, 4]
// This recursive approach merges the two lists by comparing the heads of the lists and building the merged list step-by-step by choosing the smaller value at each step. The recursion handles the merging until one of the lists is completely processed (becomes null), at which point the remaining elements of the other list are appended directly to the merged list.
