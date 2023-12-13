# Makefile for Java program

# Variables
JAVAC = javac
JAVA = java
SRC_DIR = ./src
BIN_DIR = ./bin
MAIN_CLASS = Main

# Targets
all: $(BIN_DIR)/$(MAIN_CLASS).class

run: all
	$(JAVA) -cp $(BIN_DIR) src.$(MAIN_CLASS)

$(BIN_DIR)/$(MAIN_CLASS).class: $(SRC_DIR)/$(MAIN_CLASS).java
	$(JAVAC) -d $(BIN_DIR) $<

clean:
	rm -rf $(BIN_DIR)

.PHONY: all run clean
