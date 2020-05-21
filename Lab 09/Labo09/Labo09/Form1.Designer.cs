namespace Labo09
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }

            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.queryButton = new System.Windows.Forms.Button();
            this.buttonInscription = new System.Windows.Forms.Button();
            this.buttonAddSignature = new System.Windows.Forms.Button();
            this.buttonRegister = new System.Windows.Forms.Button();
            this.tableLayoutPanel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.tableLayoutPanel1.ColumnCount = 4;
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Controls.Add(this.queryButton, 3, 0);
            this.tableLayoutPanel1.Controls.Add(this.buttonInscription, 2, 0);
            this.tableLayoutPanel1.Controls.Add(this.buttonAddSignature, 1, 0);
            this.tableLayoutPanel1.Controls.Add(this.buttonRegister, 0, 0);
            this.tableLayoutPanel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tableLayoutPanel1.Location = new System.Drawing.Point(0, 0);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 2;
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 15F));
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 85F));
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Absolute, 20F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(602, 387);
            this.tableLayoutPanel1.TabIndex = 0;
            // 
            // queryButton
            // 
            this.queryButton.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.queryButton.Dock = System.Windows.Forms.DockStyle.Fill;
            this.queryButton.Location = new System.Drawing.Point(453, 3);
            this.queryButton.Name = "queryButton";
            this.queryButton.Size = new System.Drawing.Size(146, 52);
            this.queryButton.TabIndex = 3;
            this.queryButton.Text = "Consultar";
            this.queryButton.UseVisualStyleBackColor = true;
            this.queryButton.Click += new System.EventHandler(this.queryButton_Click);
            // 
            // buttonInscription
            // 
            this.buttonInscription.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.buttonInscription.Dock = System.Windows.Forms.DockStyle.Fill;
            this.buttonInscription.Location = new System.Drawing.Point(303, 3);
            this.buttonInscription.Name = "buttonInscription";
            this.buttonInscription.Size = new System.Drawing.Size(144, 52);
            this.buttonInscription.TabIndex = 2;
            this.buttonInscription.Text = "Inscripcion";
            this.buttonInscription.UseVisualStyleBackColor = true;
            this.buttonInscription.Click += new System.EventHandler(this.buttonInscription_Click);
            // 
            // buttonAddSignature
            // 
            this.buttonAddSignature.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.buttonAddSignature.Dock = System.Windows.Forms.DockStyle.Fill;
            this.buttonAddSignature.Location = new System.Drawing.Point(153, 3);
            this.buttonAddSignature.Name = "buttonAddSignature";
            this.buttonAddSignature.Size = new System.Drawing.Size(144, 52);
            this.buttonAddSignature.TabIndex = 1;
            this.buttonAddSignature.Text = "Materia";
            this.buttonAddSignature.UseVisualStyleBackColor = true;
            this.buttonAddSignature.Click += new System.EventHandler(this.buttonAddSignature_Click);
            // 
            // buttonRegister
            // 
            this.buttonRegister.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.buttonRegister.Dock = System.Windows.Forms.DockStyle.Fill;
            this.buttonRegister.Location = new System.Drawing.Point(3, 3);
            this.buttonRegister.Name = "buttonRegister";
            this.buttonRegister.Size = new System.Drawing.Size(144, 52);
            this.buttonRegister.TabIndex = 0;
            this.buttonRegister.Text = "Estudiante";
            this.buttonRegister.UseVisualStyleBackColor = true;
            this.buttonRegister.Click += new System.EventHandler(this.buttonRegister_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(602, 387);
            this.Controls.Add(this.tableLayoutPanel1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.tableLayoutPanel1.ResumeLayout(false);
            this.ResumeLayout(false);
        }

        #endregion

        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private System.Windows.Forms.Button queryButton;
        private System.Windows.Forms.Button buttonInscription;
        private System.Windows.Forms.Button buttonAddSignature;
        private System.Windows.Forms.Button buttonRegister;
    }
}