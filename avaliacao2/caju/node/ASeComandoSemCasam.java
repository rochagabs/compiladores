/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class ASeComandoSemCasam extends PComandoSemCasam
{
    private TSe _se_;
    private TParEsq _parEsq_;
    private PExp _exp_;
    private TParDir _parDir_;
    private PComandoCasam _comandoCasam_;

    public ASeComandoSemCasam()
    {
        // Constructor
    }

    public ASeComandoSemCasam(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") TParEsq _parEsq_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TParDir _parDir_,
        @SuppressWarnings("hiding") PComandoCasam _comandoCasam_)
    {
        // Constructor
        setSe(_se_);

        setParEsq(_parEsq_);

        setExp(_exp_);

        setParDir(_parDir_);

        setComandoCasam(_comandoCasam_);

    }

    @Override
    public Object clone()
    {
        return new ASeComandoSemCasam(
            cloneNode(this._se_),
            cloneNode(this._parEsq_),
            cloneNode(this._exp_),
            cloneNode(this._parDir_),
            cloneNode(this._comandoCasam_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeComandoSemCasam(this);
    }

    public TSe getSe()
    {
        return this._se_;
    }

    public void setSe(TSe node)
    {
        if(this._se_ != null)
        {
            this._se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._se_ = node;
    }

    public TParEsq getParEsq()
    {
        return this._parEsq_;
    }

    public void setParEsq(TParEsq node)
    {
        if(this._parEsq_ != null)
        {
            this._parEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parEsq_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TParDir getParDir()
    {
        return this._parDir_;
    }

    public void setParDir(TParDir node)
    {
        if(this._parDir_ != null)
        {
            this._parDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parDir_ = node;
    }

    public PComandoCasam getComandoCasam()
    {
        return this._comandoCasam_;
    }

    public void setComandoCasam(PComandoCasam node)
    {
        if(this._comandoCasam_ != null)
        {
            this._comandoCasam_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoCasam_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._se_)
            + toString(this._parEsq_)
            + toString(this._exp_)
            + toString(this._parDir_)
            + toString(this._comandoCasam_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._se_ == child)
        {
            this._se_ = null;
            return;
        }

        if(this._parEsq_ == child)
        {
            this._parEsq_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._parDir_ == child)
        {
            this._parDir_ = null;
            return;
        }

        if(this._comandoCasam_ == child)
        {
            this._comandoCasam_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._se_ == oldChild)
        {
            setSe((TSe) newChild);
            return;
        }

        if(this._parEsq_ == oldChild)
        {
            setParEsq((TParEsq) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._parDir_ == oldChild)
        {
            setParDir((TParDir) newChild);
            return;
        }

        if(this._comandoCasam_ == oldChild)
        {
            setComandoCasam((PComandoCasam) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
