/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logger;

import Data.Configuration.StringsKeysHelper;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GlobalDev
 */
public class LoggerRepository implements ILoggerRepository {    
    Logger logger = Logger.getLogger("Logs");  
    FileHandler fh;  
    @Override
    public void LogSevere(Exception ex) {
        try {          
            fh = new FileHandler(StringsKeysHelper.GetAppConfigPath().substring(1)+ "/MyLogFile.log");
        } catch (IOException ex1) {
            Logger.getLogger(LoggerRepository.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (SecurityException ex1) {
            Logger.getLogger(LoggerRepository.class.getName()).log(Level.SEVERE, null, ex1);
        }
        logger.severe(ex.getMessage());
    }

    @Override
    public void LogWarning(String log) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void LogInfo(String log) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
