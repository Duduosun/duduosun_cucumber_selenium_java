@AudiWeService

Feature: Returns prices for all configured services for a specified dealer code.
  Where the service does not have a dealer code configured then the default price will be returned

  Given getCarInfoByCarReg Webservice
  When User Enter Car Registration "<CarReg>"
  Then "<JSONServicePriceResult>" is returned
  And Default Price "<Price>" is returned