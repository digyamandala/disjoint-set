package com.unionfind;

public class QuickFind implements UnionFind {

  private int n;

  private int[] id;

  QuickFind(int n) {

    this.n = n + 1;
    id = new int[n + 1];

    for (int i = 0; i < this.n; i++) {
      id[i] = i;
    }
  }

  @Override
  public void union(int p, int q) {
    int idp = id[p];
    int idq = id[q];

    for (int i = 0; i < n; i++) {
      if (id[i] == idp) {
        id[i] = idq;
      }
    }
  }

  @Override
  public boolean isConnected(int p, int q) {
    return id[p] == id[q];
  }

  @Override
  public void printAllIds() {
    for (int i = 0; i < n; i++) {
      System.out.print(id[i] + " ");
    }
    System.out.println();
  }
}
