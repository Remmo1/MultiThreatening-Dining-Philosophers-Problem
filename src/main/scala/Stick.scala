package com.company

import java.lang.InterruptedException
import java.util.concurrent.Semaphore

class Stick :
  private def avaliable = new Semaphore(1)

  def take() : Unit =
    try
      avaliable.acquire()
    catch
      case e : InterruptedException => e.printStackTrace()

  def release() : Unit =
    avaliable.release()
    
object Stick