/* 
 * <copyright> 
 *  Copyright 1999-2004 Cougaar Software, Inc.
 *  under sponsorship of the Defense Advanced Research Projects 
 *  Agency (DARPA). 
 *  
 *  You can redistribute this software and/or modify it under the
 *  terms of the Cougaar Open Source License as published on the
 *  Cougaar Open Source Website (www.cougaar.org).  
 *  
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 *  LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 *  A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 *  OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 *  SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 *  LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 *  OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *  
 * </copyright> 
 */ 


package org.cougaar.core.security.securebootstrap;

public class Logger
{
  private static Logger _logger;

  public void debug(String s) {
  }
  public void debug(String s, Exception e) {
  }
  public void info(String s) {
  }
  public void info(String s, Exception e) {
  }
  public void warn(String s) {
  }
  public void warn(String s, Exception e) {
  }
  public void error(String s) {
  }
  public void error(String s, Exception e) {
  }

  public boolean isDebugEnabled() {
    return false;
  }
  public boolean isInfoEnabled() {
    return false;
  }
  public boolean isWarnEnabled() {
    return false;
  }
  public boolean isErrorEnabled() {
    return false;
  }

  public static Logger getInstance() {
    if (_logger == null) {
      try {
	_logger = (Logger)
	  Class.forName
	  (System.getProperty
	   ("org.cougaar.core.security.securebootstrap.logger")).newInstance();
      }
      catch (Exception e) {
	_logger = new NullLogger();
      }
    }
    return _logger;
  }
}
