Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create Country
    And  Click on the element  in the left nav

      | setupOne   |
      | parameters |
      | countries  |

    And  Click on the element in the Dialog

      | addButton |

    And User sending the keys in Dialog content
      | nameInput | gelecek12 |
      | codeInput | 20231    |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | gelecek12 |

    And Success message should be displayed

  Scenario: Create a Nationality
    And Click on the element  in the left nav
      | setupOne      |
      | parameters    |
      | nationalities |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | gidecek1 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | gidecek1 |

    And Success message should be displayed

  Scenario: Create a Fee, delete Fee

    And Click on the element  in the left nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput       | senin1 |
      | codeInput       | 12541  |
      | integrationCode | 19651  |
      | priorityCode    | 42521  |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | senin1 |

    And Success message should be displayed

  Scenario: Create a Fee, delete Fee

    And Click on the element  in the left nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput       | ismFee1 |
      | codeInput       | i122      |
      | integrationCode | 1232    |
      | priorityCode    | 421       |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | ismFee1 |

    And Success message should be displayed
