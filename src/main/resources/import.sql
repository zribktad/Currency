CREATE TABLE currencies (
                          shortName VARCHAR(10) NOT NULL PRIMARY KEY,
                          validFrom VARCHAR(255) NOT NULL,
                          name VARCHAR(255) NOT NULL,
                          country VARCHAR(255) NOT NULL,
                          move DOUBLE NOT NULL,
                          amount INT NOT NULL,
                          valBuy DOUBLE NOT NULL,
                          valSell DOUBLE NOT NULL,
                          valMid DOUBLE NOT NULL,
                          currBuy DOUBLE NOT NULL,
                          currSell DOUBLE NOT NULL,
                          currMid DOUBLE NOT NULL,
                          version DOUBLE NOT NULL,
                          cnbMid DOUBLE NOT NULL,
                          ecbMid DOUBLE NOT NULL
);
