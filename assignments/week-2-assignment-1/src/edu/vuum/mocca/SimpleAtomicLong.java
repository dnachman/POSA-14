// Import the necessary Java synchronization and scheduling classes.

package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

/**
 * @class SimpleAtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;


    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
    // zTODO - add the implementation
    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
    public SimpleAtomicLong(long initialValue) {
        // zTODO - you fill in here
    	mValue = initialValue;
    }

    /**
     * @brief Gets the current value
     * 
     * @returns The current value
     */
    public long get() {
        // zTODO - you fill in here
    	
    	return mValue;
    	
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
    public long decrementAndGet() {
        // zTODO - you fill in here
    	reentrantReadWriteLock.writeLock().lock();
    	mValue = mValue - 1;
    	reentrantReadWriteLock.writeLock().unlock();
    	return mValue;
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
    public long getAndIncrement() {
        // zTODO - you fill in here
    	reentrantReadWriteLock.writeLock().lock();
    	long tempValue = mValue;
    	mValue = mValue + 1;
    	reentrantReadWriteLock.writeLock().unlock();
    	return tempValue;
    	
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
    public long getAndDecrement() {
        // zTODO - you fill in here
    	reentrantReadWriteLock.writeLock().lock();
    	long tempValue = mValue;
    	mValue = mValue - 1;
    	reentrantReadWriteLock.writeLock().unlock();
    	return tempValue;
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
    public long incrementAndGet() {
        // zTODO - you fill in here
    	reentrantReadWriteLock.writeLock().lock();
    	mValue = mValue + 1;
    	reentrantReadWriteLock.writeLock().unlock();
    	return mValue;
    }
}

