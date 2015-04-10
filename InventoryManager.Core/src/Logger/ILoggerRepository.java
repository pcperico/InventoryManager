/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logger;

/**
 *
 * @author GlobalDev
 */
public interface ILoggerRepository {
    public void LogSevere(Exception ex);
    public void LogWarning(String log);
    public void LogInfo(String log);    
}
