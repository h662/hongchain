package org.example;

public class Block {
    public String hash;
    public String previousHash;
    private String data;            // 오리지날: Transaction
    private long timeStamp;
    private int nonce = 0;          // 정해진 값이 있음

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = System.currentTimeMillis();
    }

    public String calculateHash() {
        String input = previousHash + timeStamp + data + nonce;

        return StringUtil.applySha256(input);
    }
}
