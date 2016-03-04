@AudiWeService

Feature: Returns car information based on VRM (car registration). Defaults to only search for Audi vehicles unless
  isAudiOnly is set to false

  Given getCarInfoByCarReg Webservice
  When User Enter Car Registration "<CarReg>"
  Then "<ExperianVRMResult>" is Returned
  And Emissions Complete Search Return "<True>"