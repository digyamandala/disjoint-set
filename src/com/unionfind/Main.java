package com.unionfind;

public class Main {

  public static void main(String[] args) {

    UnionFind quickFind = new QuickFind(9);

    quickFind.union(3, 8);
    quickFind.union(4, 3);
    quickFind.union(6, 5);
    quickFind.union(9, 4);
    quickFind.union(2, 1);
    System.out.println(quickFind.isConnected(0, 7));
    System.out.println(quickFind.isConnected(8, 9));
    quickFind.union(5, 0);
    quickFind.union(7, 2);
    quickFind.union(1, 0);
    quickFind.union(6, 1);
    System.out.println(quickFind.isConnected(0, 7));
    quickFind.printAllIds();
    System.out.println();


    UnionFind quickUnion = new QuickUnion(9);
    quickUnion.union(4, 3);
    quickUnion.union(3, 8);
    quickUnion.union(6, 5);
    quickUnion.union(9, 4);
    quickUnion.union(2, 1);
    quickUnion.union(5, 0);
    quickUnion.union(7, 2);
    quickUnion.union(6, 1);
    quickUnion.union(7, 3);
    quickUnion.printAllIds();
    System.out.println(quickUnion.isConnected(6, 9));

    UnionFind weightedQuickUnion = new WeightedQuickUnion(9);
    weightedQuickUnion.union(4, 3);
    weightedQuickUnion.union(3, 8);
    weightedQuickUnion.union(6, 5);
    weightedQuickUnion.union(9, 4);
    weightedQuickUnion.union(2, 1);
    weightedQuickUnion.union(5, 0);
    weightedQuickUnion.union(7, 2);
    weightedQuickUnion.union(6, 1);
    weightedQuickUnion.union(7, 3);
    weightedQuickUnion.printAllIds();
    System.out.println(weightedQuickUnion.isConnected(6, 9));
  }
}
