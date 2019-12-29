package com.unionfind;

public interface UnionFind {

  void union(int p, int q);

  boolean isConnected(int p, int q);

  void printAllIds();
}
