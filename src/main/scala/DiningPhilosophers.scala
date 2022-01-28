package com.company

import com.company.Stick

import java.lang.Thread.sleep
import java.util.concurrent.Semaphore
import scala.util.Random

object DiningPhilosophers :

  private val NUMBER_OF_PHILOSOPHERS = 5
  private val MEDITATING_TIME = 1000
  private val EATING_TIME = 1000

  private val sticks = new Array[Stick](NUMBER_OF_PHILOSOPHERS)
  private val philosophers = new Array[DiningPhilosophers.Philosopher](NUMBER_OF_PHILOSOPHERS)

  private val random = new Random()
  private val hotelPorter = new Semaphore(NUMBER_OF_PHILOSOPHERS - 1, true)

  class Philosopher(val number: Int) extends Thread("Philosopher " + (number + 1)) :

    final private var left = new Stick
    final private var right = new Stick

    right = sticks(number)
    left = sticks((number + 1) % NUMBER_OF_PHILOSOPHERS)

    @throws[InterruptedException]
    def eat(): Unit =
      hotelPorter.acquire()
      left.take()
      right.take()

      System.out.println(getName + " is eating")
      sleep(random.nextInt(EATING_TIME))
      System.out.println(getName + " will be meditating")

      left.release()
      right.release()
      hotelPorter.release()


    override def run(): Unit =
      var TRY_TO_EAT = 3
      try while (
        TRY_TO_EAT > 0
      )
        System.out.println(getName + " is meditating")
        sleep(random.nextInt(MEDITATING_TIME))
        System.out.println(getName + " will eat")
        eat()
        TRY_TO_EAT -= 1
      catch
        case e: InterruptedException =>
          e.printStackTrace()




  def main(args: Array[String]): Unit =
    for i <- 0 until NUMBER_OF_PHILOSOPHERS do
      sticks(i) = new Stick

    for i <- 0 until NUMBER_OF_PHILOSOPHERS do
      philosophers(i) = new DiningPhilosophers.Philosopher(i)

    for p <- philosophers do
      p.start()