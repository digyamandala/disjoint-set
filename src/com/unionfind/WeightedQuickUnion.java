package com.unionfind;

public class WeightedQuickUnion implements UnionFind {

  private int n;

  private int[] parent;

  private int[] weight;

  WeightedQuickUnion(int n) {
    this.n = n + 1;
    parent = new int[n + 1];
    weight = new int[n + 1];
    for (int i = 0; i < this.n; i++) {
      parent[i] = i;
      weight[i] = 1;
    }
  }

  @Override
  public void union(int p, int q) {
    int rootOfP = findRootOf(p);
    int rootOfQ = findRootOf(q);

    if (weight[rootOfP] < weight[rootOfQ]) {
      parent[rootOfP] = rootOfQ;

      weight[rootOfQ] = weight[rootOfP] + weight[rootOfQ];
      weight[rootOfP] = 0;
    } else {
      parent[rootOfQ] = rootOfP;

      weight[rootOfP] = weight[rootOfQ] + weight[rootOfP];
      weight[rootOfQ] = 0;
    }
  }


  private int findRootOf(int p) {

    while (p != parent[p]) {
      parent[p] = parent[parent[p]]; //use this for implementing PATH COMPRESSION
      p = parent[p];
    }
    return p;
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
