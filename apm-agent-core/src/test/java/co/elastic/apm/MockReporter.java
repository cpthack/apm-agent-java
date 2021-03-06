package co.elastic.apm;

import co.elastic.apm.impl.Transaction;
import co.elastic.apm.report.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MockReporter implements Reporter {
    private final List<Transaction> transactions = new ArrayList<>();

    @Override
    public void report(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }

    public Transaction getFirstTransaction() {
        return transactions.iterator().next();
    }

    @Override
    public int getDropped() {
        return 0;
    }

    @Override
    public void scheduleFlush() {

    }

    @Override
    public void close() {

    }
}
