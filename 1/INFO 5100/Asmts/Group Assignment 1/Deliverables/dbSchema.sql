CREATE TABLE User (
    UserID INT PRIMARY KEY,         -- PK
    Name VARCHAR(100),
    Password VARCHAR(255),
    Email VARCHAR(100),
    Age INT,
    Weight DECIMAL(5, 2),
    Height DECIMAL(5, 2),
    PrivacyDataSetting VARCHAR(100),
    LifeEventScore DECIMAL(5, 2)
);

CREATE TABLE Family (
    FamilyID INT PRIMARY KEY,       -- PK
    FamilyName VARCHAR(100),
    FamilyScore DECIMAL(5, 2)
);

CREATE TABLE Community (
    CommunityID INT PRIMARY KEY,    -- PK
    CommunityName VARCHAR(100),
    CommunityScore DECIMAL(5, 2)
);

CREATE TABLE UrbanIssue (
    IssueID INT PRIMARY KEY,        -- PK
    IssueType VARCHAR(100),
    IssueDescription TEXT,
    IssueEffect DECIMAL(5, 2)
);

CREATE TABLE IssueMetrics (
    MetricID INT PRIMARY KEY,       -- PK
    IssueID INT,                    -- FK to UrbanIssue
    MetricName VARCHAR(100),        
    MetricValue DECIMAL(5, 2),      
    MetricDate DATETIME,            
    FOREIGN KEY (IssueID) REFERENCES UrbanIssue(IssueID)
);

CREATE TABLE Trend (
    TrendID INT PRIMARY KEY,        -- PK
    TrendDescription TEXT,
    TrendTime DATETIME,
    TrendEffect DECIMAL(5, 2)
);

CREATE TABLE TrendMetrics (
    MetricID INT PRIMARY KEY,       -- PK
    TrendID INT,                    -- FK to Trend
    MetricName VARCHAR(100),        -- Type of trend metric (e.g., ExerciseLevel, SleepDuration)
    MetricValue DECIMAL(5, 2),      -- Quantitative value for the metric
    MetricDate DATETIME,            -- Timestamp for when this metric was observed
    FOREIGN KEY (TrendID) REFERENCES Trend(TrendID)
);


CREATE TABLE ActivityData (
    ActivityDataID INT PRIMARY KEY, -- PK
    UserID INT,                     -- FK to User
    Move DECIMAL(5, 2),
    Exercise DECIMAL(5, 2),
    Stand DECIMAL(5, 2),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE HealthData (
    HealthDataID INT PRIMARY KEY,   -- PK
    UserID INT,                     -- FK to User
    HeartRate DECIMAL(5, 2),
    BloodPressure DECIMAL(5, 2),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE SleepData (
    SleepDataID INT PRIMARY KEY,    -- PK
    UserID INT,                     -- FK to User
    SleepDuration DECIMAL(5, 2),
    DeepSleepTime DECIMAL(5, 2),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE Device (
    DeviceID INT PRIMARY KEY,       -- PK
    UserID INT,                     -- FK to User
    Type VARCHAR(50),
    UpdateTime DATETIME,
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE LifeEvent (
    LifeEventID INT PRIMARY KEY,    -- PK
    UserID INT,                     -- FK to User
    EventName VARCHAR(100),
    EventDate DATETIME,
    EventImpactScore DECIMAL(5, 2),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE Family_User (
    FamilyID INT,                   -- FK to Family
    UserID INT,                     -- FK to User
    PRIMARY KEY (FamilyID, UserID), -- Composite PK
    FOREIGN KEY (FamilyID) REFERENCES Family(FamilyID),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE Community_Family (
    CommunityID INT,                -- FK to Community
    FamilyID INT,                   -- FK to Family
    PRIMARY KEY (CommunityID, FamilyID), -- Composite PK
    FOREIGN KEY (CommunityID) REFERENCES Community(CommunityID),
    FOREIGN KEY (FamilyID) REFERENCES Family(FamilyID)
);

CREATE TABLE Community_User (
    CommunityID INT,                -- FK to Community
    UserID INT,                     -- FK to User
    PRIMARY KEY (CommunityID, UserID), -- Composite PK
    FOREIGN KEY (CommunityID) REFERENCES Community(CommunityID),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);
