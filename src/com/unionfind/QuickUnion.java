package com.unionfind;

public class QuickUnion implements UnionFind {

  private int n;

  private int[] parent;

  QuickUnion(int n) {
    this.n = n + 1;
    parent = new int[n + 1];
    for (int i = 0; i < this.n; i++) {
      parent[i] = i;
    }
  }

  @Override
  public void union(int p, int q) {

    int rootOfP = findRootOf(p);
    int rootOfQ = findRootOf(q);

    parent[rootOfP] = rootOfQ;
  }

  private int findRootOf(int p) {
    int parentOfP = parent[p];

    while (parentOfP != p) {
      p = parentOfP;
      parentOfP = parent[parentOfP];
    }
    return parentOfP;
  }

  @Override
  public boolean isConnected(int p, int q) {
    return findRootOf(p) == findRootOf(q);
  }

  @Override
  public void printAllIds() {
    for (int i = 0; i < n; i++) {
      System.out.print(parent[i] + " ");
    }
    System.out.println();
  }
}
