/*
 * Copyright (C) 2018 Oluwole Oyetoke <oluwoleoyetoke@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cracking.the.coding.interview.chapter02.linkedlist.question;

import com.cracking.the.coding.interview.chapter02.linkedlist.datastructure.MySinglyLinkedList;
import com.cracking.the.coding.interview.chapter02.linkedlist.datastructure.Node;

/**
 * <b>Reverse</b> a Singly Linked List in place
 *
 * @author Oluwole Oyetoke {@literal <}oluwoleoyetoke {@literal @}
 */
public class Others1 {


    /**
     * Capture next node before changing the pointer of the current node to point to the previous node
     * @param list list to reverse
     * @return list reversed list
     */
    public static MySinglyLinkedList<Integer> solve(MySinglyLinkedList<Integer> list) {
        if (list.head == null || list.head.nextNode == null) {
            return null;
        }
        Node<Integer> previous = list.head;
        Node<Integer> initialHead = list.head;


        Node<Integer> current = list.head.nextNode;
        Node<Integer> next = current.nextNode; //dummy start value
        previous.nextNode = null;

        while (current != null) {
            next = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = next;
        }
        list.tail = initialHead;
        list.head = previous;
        
        return list;
    }
    
    /**
     * Linked list reversal main method....uncomment to run
     * @param args command line arguments
     *//*
    public static void main(String[] args){
        MySinglyLinkedList list = new MySinglyLinkedList();
        for(int i=0; i<20; i++){
        list.add(i);
        }
        
       MySinglyLinkedList returnedList =  solve (list);
       if(returnedList!=null){
        System.out.println(returnedList.thisToString());
       }
    }*/
}
